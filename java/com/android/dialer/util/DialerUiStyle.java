/*
 * Copyright (C) 2024-2026 Lunaris AOSP
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.android.dialer.util;

import android.content.Context;

import androidx.preference.PreferenceManager;

/** Shared selector for the Lunaris and PenguinOS dialer surfaces. */
public final class DialerUiStyle {

  public static final String PREF_UI_STYLE = "dialer_ui_style";
  public static final String UI_STYLE_LUNARIS = "lunaris";
  public static final String UI_STYLE_PENGUIN = "penguin";

  private DialerUiStyle() {
  }

  public static boolean isPenguin(Context context) {
    return UI_STYLE_PENGUIN.equals(
        PreferenceManager.getDefaultSharedPreferences(context)
            .getString(PREF_UI_STYLE, UI_STYLE_LUNARIS));
  }
}
