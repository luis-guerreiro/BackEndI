package Aula14_PadraoDAO;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;


public class MedicamentoServiceTest {

    MedicamentoService medicamentoService;


    @BeforeEach
    void doBefore(){
        medicamentoService = new MedicamentoService(new MedicamentoDaoH2(new ConfiguracaoJDBC()));
    }

    @Test
    public void guardarMedicamento(){
        Medicamento medicamento = new Medicamento("Ibuprofeno","Aché",395,23.0);
        medicamentoService.salvar(medicamento);
        assertTrue(medicamento.getId()!=null);

        Medicamento medicamento1 = new Medicamento("Dorflex","SanofiLascou",550,26.5);
        medicamentoService.salvar(medicamento1);
        assertTrue(medicamento1.getId()!=null);
    }



}
