package AnnotationService.annotations;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

//@ NaoNulo, @Numero(min=X,max=Y) e @Texto(tamanhoMax=X)
@Retention (RetentionPolicy.RUNTIME)
@Target (ElementType.FIELD)
public @interface Numero {
	int min() default 0; 
	int max(); 
}
