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
			iniciarTransaccion();
			session.saveOrUpdate(aula);
			commitearCerrarTransaccion();
			return true;
		} catch (HibernateException e) {
			JOptionPane.showMessageDialog(null, "Exception: " + e.getMessage());
			return false;
		} finally {
		}
	}

	@Override
	public boolean eliminarAula(Aula aula) {
		try {
			iniciarTransaccion();
			session.delete(aula);
			commitearCerrarTransaccion();
			return true;
		} catch (HibernateException e) {
			JOptionPane.showMessageDialog(null, "Exception: " + e.getMessage());
			return false;
		} finally {
		}
	}

	@Override
	@SuppressWarnings("unchecked")
	public List<Aula> listarAula() {
		abrirSesion();
		criteria = session.createCriteria(Aula.class);
		aulaList = criteria.list();
		cerrarSesion();
		return aulaList;
	}

}
