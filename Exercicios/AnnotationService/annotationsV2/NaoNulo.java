package AnnotationService.annotationsV2;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

//@ NaoNulo, @Numero(min=X,max=Y) e @Texto(tamanhoMax=X)
@Retention (RetentionPolicy.RUNTIME)
@Target (ElementType.FIELD)
public @interface NaoNulo {
	String msgError();
}
