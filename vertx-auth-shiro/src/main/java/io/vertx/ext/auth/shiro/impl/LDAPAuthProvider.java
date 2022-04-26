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

package io.vertx.ext.auth.shiro.impl;

import static io.vertx.ext.auth.shiro.LDAPProviderConstants.LDAP_AUTHENTICATION_MECHANISM;
import static io.vertx.ext.auth.shiro.LDAPProviderConstants.LDAP_CONTEXT_FACTORY_CLASS_NAME;
import static io.vertx.ext.auth.shiro.LDAPProviderConstants.LDAP_POOLING_ENABLED;
import static io.vertx.ext.auth.shiro.LDAPProviderConstants.LDAP_REFERRAL;
import static io.vertx.ext.auth.shiro.LDAPProviderConstants.LDAP_SYSTEM_PASSWORD;
import static io.vertx.ext.auth.shiro.LDAPProviderConstants.LDAP_SYSTEM_USERNAME;
import static io.vertx.ext.auth.shiro.LDAPProviderConstants.LDAP_URL;
import static io.vertx.ext.auth.shiro.LDAPProviderConstants.LDAP_USER_DN_TEMPLATE_FIELD;

import org.apache.shiro.realm.Realm;
import org.apache.shiro.realm.ldap.JndiLdapContextFactory;
import org.apache.shiro.realm.ldap.JndiLdapRealm;

import io.vertx.core.Vertx;
import io.vertx.core.json.JsonObject;

/**
 *
 * @author <a href="http://tfox.org">Tim Fox</a>
 */
@Deprecated
public class LDAPAuthProvider extends ShiroAuthProviderImpl {

  public static Realm createRealm(JsonObject config) {
    JndiLdapRealm ldapRealm = new JndiLdapRealm();
    JndiLdapContextFactory factory = new JndiLdapContextFactory();
    String userDNTemplate = config.getString(LDAP_USER_DN_TEMPLATE_FIELD);
    if (userDNTemplate != null) {
      ldapRealm.setUserDnTemplate(userDNTemplate);
    }
    String url = config.getString(LDAP_URL);
    if (url != null) {
      factory.setUrl(url);
    }
    String authenticationMechanism = config.getString(LDAP_AUTHENTICATION_MECHANISM);
    if (authenticationMechanism != null) {
      factory.setAuthenticationMechanism(authenticationMechanism);
    }
    String contextFactoryClassName = config.getString(LDAP_CONTEXT_FACTORY_CLASS_NAME);
    if (contextFactoryClassName != null) {
      factory.setContextFactoryClassName(contextFactoryClassName);
    }
    boolean poolingEnabled = config.getBoolean(LDAP_POOLING_ENABLED, false);
    factory.setPoolingEnabled(poolingEnabled);
    String referral = config.getString(LDAP_REFERRAL);
    if (referral != null) {
      factory.setReferral(referral);
    }
    String systemUsername = config.getString(LDAP_SYSTEM_USERNAME);
    if (systemUsername != null) {
      factory.setSystemUsername(systemUsername);
    }
    String systemPassword = config.getString(LDAP_SYSTEM_PASSWORD);
    if (systemPassword != null) {
      factory.setSystemPassword(systemPassword);
    }
    ldapRealm.setContextFactory(factory);
    ldapRealm.init();
    return ldapRealm;
  }

  public LDAPAuthProvider(Vertx vertx, Realm realm) {
    super(vertx, realm);
  }
}
