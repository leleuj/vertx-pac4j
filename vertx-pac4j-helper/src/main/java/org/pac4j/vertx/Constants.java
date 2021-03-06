/*
  Copyright 2014 - 2014 pac4j organization

   Licensed under the Apache License, Version 2.0 (the "License");
   you may not use this file except in compliance with the License.
   You may obtain a copy of the License at

       http://www.apache.org/licenses/LICENSE-2.0

   Unless required by applicable law or agreed to in writing, software
   distributed under the License is distributed on an "AS IS" BASIS,
   WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
   See the License for the specific language governing permissions and
   limitations under the License.
 */
package org.pac4j.vertx;

/**
 * Pac4j constants for Vert.x binding.
 * 
 * @author Michael Remond
 * @since 1.0.0
 *
 */
public interface Constants {

    public static final String HOST_HEADER = "Host";

    public final static String FORM_ATTRIBUTES = "pac4jFormAttributes";

    public final static String FORM_URLENCODED_CONTENT_TYPE = "application/x-www-form-urlencoded";

    public static final String STATUS_ATTRIBUTE = "status";

    public static final String SUCCESS_STATUS = "ok";

    public static final String ERROR_STATUS = "error";

    public static final String ERROR_MESSAGE_ATTRIBUTE = "message";

}
