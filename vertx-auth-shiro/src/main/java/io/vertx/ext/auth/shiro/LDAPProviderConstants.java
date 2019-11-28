/*
 * Copyright 2014 Red Hat, Inc.
 *
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  and Apache License v2.0 which accompanies this distribution.
 *
 *  The Eclipse Public License is available at
 *  http://www.eclipse.org/legal/epl_v10.html
 *
 *  The Apache License v2.0 is available at
 *  http://www.opensource.org/licenses/apache2.0.php
 *
 *  You may elect to redistribute this code under either of these licenses.
 */

package io.vertx.ext.auth.shiro;

/**
 * Configuration keys used when configuring a Shiro LDAP auth realm
 * @deprecated ShiroAuth has been replaced by {@link io.vertx.ext.auth.properties.PropertyFileAuthentication} and {@link io.vertx.ext.auth.ldap.LdapAuthentication}
 *
 * @author <a href="http://tfox.org">Tim Fox</a>
 */
@Deprecated
public interface LDAPProviderConstants {

  String LDAP_USER_DN_TEMPLATE_FIELD = "ldap_user_dn_template";
  String LDAP_URL = "ldap_url";
  String LDAP_AUTHENTICATION_MECHANISM = "ldap_authentication_mechanism";
  String LDAP_CONTEXT_FACTORY_CLASS_NAME = "ldap_context_factory_class_name";
  String LDAP_POOLING_ENABLED = "ldap_pooling_enabled";
  String LDAP_REFERRAL = "ldap_referral";
  String LDAP_SYSTEM_USERNAME = "ldap_system_username";
  String LDAP_SYSTEM_PASSWORD = "ldap_system_password";

}
