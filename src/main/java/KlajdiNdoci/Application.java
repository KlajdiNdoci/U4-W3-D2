package KlajdiNdoci;

import KlajdiNdoci.entities.Evento;
import KlajdiNdoci.entities.EventoDAO;
import KlajdiNdoci.enums.TipoEvento;
import KlajdiNdoci.utils.JpaUtil;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import java.time.LocalDate;

public class Application {
    private static final EntityManagerFactory emf = JpaUtil.getEntityManagerFactory();

    public static void main(String[] args) {
        EntityManager em = emf.createEntityManager();
        EventoDAO ed = new EventoDAO(em);

        Evento ev1 = new Evento("Evento1", LocalDate.of(2022, 12, 5), "ciao", TipoEvento.PUBBLICO, 200);
        ed.save(ev1);
    }
}
