package execucao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import classes.persistencia.Carro;
import classes.persistencia.Pessoa;

public class Run {

	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("jpa-da-alegria-in-postgres");
		EntityManager entityManager = entityManagerFactory.createEntityManager();

//		Part 1
		Carro carro = new Carro("ABC-1234");
		Pessoa pessoa = new Pessoa("Fulano");

		entityManager.getTransaction().begin();

		entityManager.persist(carro);
		entityManager.persist(pessoa);

		entityManager.getTransaction().commit();
		
//		Carro carro = new Carro("Rua dos Bobos, 2");
//		Pessoa pessoa = new Pessoa("Fulano Mais Legal");
//		Pessoa outraPessoa = new Pessoa("Beltrano Massa");

//		carro.adicionarMorador(pessoa);
//		carro.adicionarMorador(outraPessoa);

//		entityManager.getTransaction().begin();

//		entityManager.persist(carro);

//		entityManager.getTransaction().commit();
	}
}
