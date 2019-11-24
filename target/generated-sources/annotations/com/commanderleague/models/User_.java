package com.commanderleague.models;

import java.io.File;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(User.class)
public abstract class User_ {

	public static volatile SingularAttribute<User, String> number_DCI;
	public static volatile SingularAttribute<User, String> password;
	public static volatile SingularAttribute<User, String> nameUser;
	public static volatile SingularAttribute<User, File> foto;
	public static volatile SingularAttribute<User, String> name;
	public static volatile SingularAttribute<User, Integer> active;
	public static volatile SingularAttribute<User, Integer> id;

}

