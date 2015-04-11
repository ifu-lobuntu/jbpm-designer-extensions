package org.jbpm.designer.shared.security;

import static java.lang.annotation.ElementType.*;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import org.uberfire.security.annotations.RolesType;

@RolesType
@Retention(RUNTIME)
@Target({TYPE, METHOD})
public @interface StandaloneRoles {

    AppRoles[] value();
}
