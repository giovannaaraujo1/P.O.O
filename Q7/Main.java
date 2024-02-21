// 7. Sistema de Perfil de Usuário para Rede Social: Uma rede social quer permitir que 
// seus usuários criem perfis. Implemente uma classe PerfilUsuario com atributos para 
// nome de usuário, bio e número de seguidores. Crie perfis para três usuários e 
// mostre os detalhes.

public class Main {

    public static void main(String[] args) {
        
        PerfilUsuario usu1 = new PerfilUsuario();
        usu1.nomeUsu = "@giovanna.araujo1";
        usu1.bio = "É justo que muito custe o que muito vale.";
        usu1.numSeg = 1400;
        usu1.social();

        PerfilUsuario usu2 = new PerfilUsuario();
        usu2.nomeUsu = "@daniloxzx";
        usu2.bio = "O importante é o que importa.";
        usu2.numSeg = 48;
        usu2.social();

        PerfilUsuario usu3 = new PerfilUsuario();
        usu3.nomeUsu = "@toniogds";
        usu3.bio = "Ciência da Computação / Sistemas para Internet.";
        usu3.numSeg = 466;
        usu3.social();

    }
}