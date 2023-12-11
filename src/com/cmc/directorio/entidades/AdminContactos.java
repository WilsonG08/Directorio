package com.cmc.directorio.entidades;

public class AdminContactos {
	// Metodos

	public Contacto buscarMasPesado(Contacto c1, Contacto c2) {
		if (c1.getPeso() > c2.getPeso()) {
			return c1;
		} else if (c2.getPeso() > c1.getPeso()) {
			return c2;
		} else {
			System.out.println("Ambos pesan lo mismo");
			return null;
		}
	}

	public boolean buscarOperadoras(Contacto ct1, Contacto ct2) {
		if (ct1.getTelefono().getOperadora() == ct2.getTelefono().getOperadora()) {
			return true;
		} else {
			return false;
		}
	}

	public void activarUsuario(Contacto con1) {
		if (con1.getTelefono().isTieneWhatsapp()) {
            con1.setActivo(true);
		}
	}

}
