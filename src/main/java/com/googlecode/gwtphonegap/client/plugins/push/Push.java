/*
 * Copyright (c) 2016 Washington State Department of Transportation
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *  http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *
 */

package com.googlecode.gwtphonegap.client.plugins.push;

import com.googlecode.gwtphonegap.client.plugins.PhoneGapPlugin;

/**
 * This class is a wrapper for the phonegap-plugin-push for Cordova. 
 * <p>
 * The implementation is based on 
 * <a href="https://github.com/phonegap/phonegap-plugin-push/blob/master/www/push.js">push.js</a>
 *
 * @author Wayne Dyck
 *
 */
public interface Push extends PhoneGapPlugin {

    /**
     * Initializes the plugin on the native side.
     *
     * @param options  see methods in {@link PushOptions}
     */
    public void init(PushOptions options);

    /**
     *
     * @param event
     * @param eventCallback
     */
    public void on(String event, EventCallback eventCallback);

    /**
     *
     * @param event
     * @param eventCallback
     */
    public void off(String event, EventCallback eventCallback);

}
