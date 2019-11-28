/*
 * Copyright 2014 Red Hat, Inc.
 *
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  and Apache License v2.0 which accompanies this distribution.
 *
 *  The Eclipse Public License is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 *
 *  The Apache License v2.0 is available at
 *  http://www.opensource.org/licenses/apache2.0.php
 *
 *  You may elect to redistribute this code under either of these licenses.
 */

package io.vertx.ext.auth.shiro;

/**
 * Configuration keys used when configuring a Shiro properties auth realm
 * @deprecated ShiroAuth has been replaced by {@link io.vertx.ext.auth.properties.PropertyFileAuthentication} and {@link io.vertx.ext.auth.ldap.LdapAuthentication}

 * @author <a href="http://tfox.org">Tim Fox</a>
 */
@Deprecated
public interface PropertiesProviderConstants {

  /**
   * The path where to look for the properties file
   */
  String PROPERTIES_PROPS_PATH_FIELD = "properties_path";

}
