/*
 * Copyright 2014 Red Hat, Inc.
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * and Apache License v2.0 which accompanies this distribution.
 *
 * The Eclipse Public License is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * The Apache License v2.0 is available at
 * http://www.opensource.org/licenses/apache2.0.php
 *
 * You may elect to redistribute this code under either of these licenses.
 */

package io.vertx.ext.auth.mongo;

import io.vertx.codegen.annotations.VertxGen;

/**
 * Password hash salt configuration.
 * @deprecated Please use the provided generic PHC strings at the column level
 */
@VertxGen
public enum HashSaltStyle {

  /**
   * Password hashes are not salted
   */
  NO_SALT,

  /**
   * Salt is in a separate column for each user in the database
   */
  COLUMN,

  /**
   * Salt is NOT stored in the database, but defined as external value like application preferences or so
   */
  EXTERNAL
}
