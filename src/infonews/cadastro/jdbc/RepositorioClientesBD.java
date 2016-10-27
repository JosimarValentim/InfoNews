package infonews.cadastro.jdbc;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import infonews.cliente.Cliente;
import infonews.cadastro.jdbc.RepositorioClientes;
	
	public class RepositorioClientesBD implements RepositorioClientes{

		/**
		 * O nome do driver JDBC a ser usado na conexão.
		 */
		private String nomeDriver;

		/**
		 * A url de conexão.
		 */
		private String urlConexao;

		/**
		 * O usuário da conexão.
		 */
		private String usuarioConexao;

		/**
		 * A senha do usuário da conexão.
		 */
		private String senhaConexao;

		/**
		 * Flag que indica se o driver foi ou não carregado.
		 */
		private boolean indDriverCarregado;

		/**
		 * Mensagem que indica falha na carga do driver.
		 */
		private static final String MSG_FALHA_CARGA_DRIVER =
			"Nome do driver JDBC usado não corresponde a uma classe válida";

		/**
		 * Mensagem que indica erro de obtenção da conexão com o banco de dados.
		 */
		private static final String MSG_ERRO_CONEXAO =
			"Erro ao obter conexão com o banco de dados";
		
		private static final String MSG_ERRO_ACESSO_BD =
			"Erro de acesso ao banco de dados";
		
		private static final String MSG_CLIENTE_CADASTRADO =
			"Cliente já cadastrado";
		
		private static final String MSG_CPF_NAO_ENCONTRADO =
			"CPF não encontrado";
		
		private static final String MSG_CPF_INVALIDO =
			"CPF inválido";

		private static final String INSERT_CLIENTE =
			"INSERT INTO cliente (cpf, nome, contato, id) VALUES (?,?,?,?)";

		private static final String PROCURA_CLI =
			"SELECT cpf, nome, contato, id FROM cliente WHERE cpf = ?";
		
		private static final String LISTA_CLI =
			"SELECT cpf, nome, contato, id FROM cliente";
		
		private static final String DELETE_CLI =
			"DELETE FROM cliente WHERE cpf = ?";
		
		/**
		 * O construtor da classe. Inicializa os parâmetros de conexão com o banco de dados.
		 *
		 * @param pNomeDriver o nome do driver.
		 * @param pUrlConexao a url de conexão com o banco.
		 * @param pUsuarioConexao o usuário da conexão.
		 * @param pSenhaConexao a senha da conexão.
		 */
		public RepositorioClientesBD(
				String pNomeDriver,
				String pUrlConexao,
				String pUsuarioConexao,
				String pSenhaConexao) {
			super();
			nomeDriver = pNomeDriver;
			urlConexao = pUrlConexao;
			usuarioConexao = pUsuarioConexao;
			senhaConexao = pSenhaConexao;
			indDriverCarregado = false;
		}

		private Connection getConexao() {

			if (!indDriverCarregado) {
				try {
					Class.forName(nomeDriver);
					indDriverCarregado = true;
				} catch (ClassNotFoundException e) {
					System.err.print(MSG_FALHA_CARGA_DRIVER);
				}
			}
			try {
				return DriverManager.getConnection(
						urlConexao,
						usuarioConexao,
						senhaConexao);
			} catch (SQLException e) {
				System.err.print(MSG_ERRO_CONEXAO);
				return null;
			}
		}

		public void inserir(Cliente c) {

			if (c != null) {
				Connection con = getConexao();
				PreparedStatement psCli = null;
				PreparedStatement psEnd = null;
				try {
					psCli = con.prepareStatement(INSERT_CLIENTE);
					psCli.setDouble(1, c.getCpf());
					psCli.setString(2, c.getNome());
					psCli.setString(3, c.getContato());
					psCli.setInt(4, c.getCodigo());
					
					psCli.executeUpdate();
					
				} catch (SQLException e) {
					System.err.print(e.getMessage());
				} finally {
					fechaRecursos(con, psCli, null);
					fechaRecursos(con, psEnd, null);
				}
			}
		}
		
		public Cliente procurar(int cpf) {
			if (cpf != 0) {
				Connection con = getConexao();
				PreparedStatement ps = null;
				ResultSet rs = null;
				try {
					ps = con.prepareStatement(PROCURA_CLI);
					ps.setInt(1, cpf);
					rs = ps.executeQuery();
					if (rs.next()) {
						int bdCpf = rs.getInt(1);
						int bdCodigo = rs.getInt(2);
						String bdNome = rs.getString(3);
						String bdContato = rs.getString(4);
						
						
						Cliente cli = new Cliente(bdCpf, bdNome, bdCodigo, bdContato);
						cli.setCpf(bdCpf);
						cli.setNome(bdNome);
						cli.setContato(bdContato);
						cli.setCodigo(bdCodigo);
						return cli;
					} else {
						System.err.print(MSG_CLIENTE_CADASTRADO);
					}
				} catch (SQLException e) {
					System.err.println(MSG_ERRO_ACESSO_BD);
					System.err.println(e.getMessage());
				} finally {
					fechaRecursos(con, ps, rs);
				}
			} 
			return null;
		}
		
		public ResultSet listar() {
				Connection con = getConexao();
				PreparedStatement ps = null;
				ResultSet rs = null;
				try {
					ps = con.prepareStatement(LISTA_CLI);
					rs = ps.executeQuery();
					if (rs.next()){
						return rs;
					}
				} catch (SQLException e) {
					System.err.println(MSG_ERRO_ACESSO_BD);
					System.err.println(e.getMessage());
				} 
			return rs;
		}
		
		public void remover(int cpf) {
		if (cpf != 0) {
			Connection con = getConexao();
			PreparedStatement ps = null;
			try {
				ps = con.prepareStatement(DELETE_CLI);
				ps.setInt(1, cpf);
				int rows = ps.executeUpdate();
				if (rows <= 0) {
					System.err.println("CPF não encontrado");
				}
			} catch (SQLException e) {
				System.err.println(MSG_CPF_NAO_ENCONTRADO);
				System.err.println(e.getMessage());
			} finally {
				fechaRecursos(con, ps, null);
			}
		} else {
			System.err.println(MSG_CPF_INVALIDO);
		}
	}

		private void fechaRecursos(
				Connection con,
				PreparedStatement ps,
				ResultSet rs) {

			try {
				if (rs != null)
					rs.close();
			} catch (Exception e) {
			}
			try {
				if (ps != null)
					ps.close();
			} catch (Exception e) {
			}
			try {
				if (con != null)
					con.close();
			} catch (Exception e) {
			}
		}
	}
