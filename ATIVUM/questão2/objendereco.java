package Q_02;

public class objendereco {
    public static void main(String[] args) {
        Endereco endereco = new Endereco("Gildásio Penedo", 356, "Primavera", "Centro", "Tucano", "BA", "48790-000");
        Medico medico = new Medico(003 "Breno Araújo", "Masculino", "Neurologia", endereco);
        medico.mostMedico();
        System.out.println("");

        endereco.setBairro("Centro");
        endereco.setCEP("48500-000");
        endereco.setCidade("Euclides da Cunha");
        endereco.setComplemento("Praça");
        endereco.setNumero(45);
        endereco.setRua("Pedro Joaquim Matos");
        endereco.setUF("BA");

        medico.setCodigo(3435669);
        medico.setEndereco(endereco);
        medico.setEspecialidade("Osseopedista");
        medico.setNome("Magunum Carvalho");
        medico.setSexo("Masculino");
        medico.mostMedico();

    }
}
