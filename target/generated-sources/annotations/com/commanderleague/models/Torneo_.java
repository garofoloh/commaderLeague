package com.commanderleague.models;

import java.util.ArrayList;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(Torneo.class)
public abstract class Torneo_ {

	public static volatile SingularAttribute<Torneo, Integer> cantJugadores;
	public static volatile SingularAttribute<Torneo, Long> id;
	public static volatile SingularAttribute<Torneo, ArrayList> jugadores;
	public static volatile SingularAttribute<Torneo, String> nombre;
	public static volatile SingularAttribute<Torneo, String> tipoTorneo;

}

