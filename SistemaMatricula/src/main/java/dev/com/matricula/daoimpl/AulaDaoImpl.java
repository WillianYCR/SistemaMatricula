package dev.com.matricula.daoimpl;

import java.util.List;

import javax.swing.JOptionPane;

import org.hibernate.HibernateException;
import org.springframework.stereotype.Repository;

import dev.com.matricula.dao.AulaDao;
import dev.com.matricula.model.Aula;

@Repository
public class AulaDaoImpl extends AbstractHibernateDao implements AulaDao {

	private List<Aula> aulaList;
	@Override
	public boolean persistirAula(Aula aula) {
		try {
			JOptionPane.showMessageDialog(null, "Inicio1");
			iniciarTransaccion();
			JOptionPane.showMessageDialog(null, "Inicio2");
			session.saveOrUpdate(aula);
			JOptionPane.showMessageDialog(null, "Inicio3");
			commitearCerrarTransaccion();
			JOptionPane.showMessageDialog(null, "Inicio4");
			return true;
		} catch (HibernateException e) {
			JOptionPane.showMessageDialog(null, "Exception: " + e.getMessage());
			return false;
		}finally{
			JOptionPane.showMessageDialog(null, "Siempre se ejecuta");
		}
	}

	@Override
	public List<Aula> listarAula() {
		abrirSesion();
		criteria = session.createCriteria(Aula.class);
		aulaList = criteria.list();
		cerrarSesion();
		return aulaList;
	}

}
