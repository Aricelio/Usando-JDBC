/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package DominModel;

import DataAccess.*;
import java.util.Date;

/**
 *
 * @author ALUNO
 */
public class Main 
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Exception 
    {
        // TODO code application logic here
        Pessoa pessoa = new Pessoa();
        
        pessoa.setCodigo(4);
        //pessoa.setNome("Celi");
        //pessoa.setDataNascimento(new Date());
        
        //PessoaDAO dao = new PessoaDAO();
        
        //dao.Salvar(pessoa);  
        //dao.Remover(pessoa);
        /*pessoa = dao.Abrir(4);
        
        System.out.print("Codigo: ");
        System.out.println(pessoa.getCodigo());
        
        System.out.print("Nome: ");
        System.out.println(pessoa.getNome());
        
        System.out.print("Data de Nascimento: ");
        System.out.println(pessoa.getDataNascimento());*/
        /*Pessoa p = new Pessoa();
        
        Email e = new Email();
        Email f = new Email();
        
        Telefone t = new Telefone();
        Telefone te = new Telefone();
        
        Endereco en = new Endereco();
        Endereco end = new Endereco();
        
        e.setEmail("ariceliosouza@hotmail.com");
        f.setEmail("ariceliodesouza@gmail.com");
        
        t.setTelefone(36135000);
        t.setDDD((byte)38);
        t.setOperadora((byte)011);        
        
        te.setTelefone(36134000);
        te.setDDD((byte)39);
        te.setOperadora((byte)012);
        
        en.setNumero(98);
        en.setRua("Rua Coronel Serrao");
        en.setBairro("Sao Jose");
        en.setCidade("Itacarambi");
        en.setUf("MG");
        en.setPais("Brasil");
        
        end.setNumero(300);
        end.setRua("Rua das Flores");
        end.setBairro("Centro");
        end.setCidade("Januaria");
        end.setUf("MG");
        end.setPais("Brasil");
        
        p.setNome("Philipe Souza");
        
        p.setDataNascimento(new Date());
        
        p.addEndereco(en);
        p.addEndereco(end);
        
        p.addEmail(e);
        p.addEmail(f);
        p.addTelefone(t);
        p.addTelefone(te);
        
        
        
        
        PessoaDAO dao = new PessoaDAO();
        dao.Salvar(p);*/
        /*------- TESTE DA VENDA  ---------------------------------------------
        Venda venda = new Venda();
        VendaDAO vDAO = new VendaDAO();
        
        //venda.setData(new Date());
        //venda.setValorTotal(200);
        //venda.setCodigo(2);
        
        
        //vDAO.Remover(venda);
        
        //----------- Método Abrir ---------------//
        venda = vDAO.Abrir(1);
        System.out.println(venda.getData());*/
        
        /*-------- TESTE DO PRODUTO ------------------------------------------
        Produto p = new Produto();
        ProdutoDAO pd = new ProdutoDAO();
        
        //p.setNome("Arroz");
        //p.setPreco(45);
        //p.setTipo("Alimenticio");
        //p.setCodigo(0);
        
        //----------- Método Abrir ---------------//
        p = pd.Abrir(1);
        System.out.println(p.getTipo());*/
        
        /*================== TESTE DO ITEM VENDA =============================*/
        /*Produto pr = new Produto();
        Venda venda = new Venda();
        ItemVenda it = new ItemVenda();
        VendaDAO vDAO = new VendaDAO();
        ProdutoDAO pDAO = new ProdutoDAO();
        
        pr.setCodigo(2);
        pr.setPreco(5);
        //pDAO.Salvar(pr);
        
        it.setProduto(pr);
        it.setQuantidade(5);
        
        venda.setData(new Date());
        venda.setPessoa(pessoa);
        venda.addItemVenda(it);
        
        vDAO.Salvar(venda); */       
        
    }
}

