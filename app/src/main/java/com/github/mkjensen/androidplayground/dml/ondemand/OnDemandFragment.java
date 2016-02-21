/*
 * Copyright 2016 Martin Kamp Jensen
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.github.mkjensen.androidplayground.dml.ondemand;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v17.leanback.app.BrowseSupportFragment;
import android.util.Log;

import com.github.mkjensen.androidplayground.R;

/**
 * Leanback browse screen for on-demand videos.
 */
public final class OnDemandFragment extends BrowseSupportFragment {

  private static final String TAG = "OnDemandFragment";

  @Override
  public void onAttach(final Context context) {
    Log.d(TAG, "onAttach");
    super.onAttach(context);
  }

  @Override
  public void onActivityCreated(@Nullable final Bundle savedInstanceState) {
    Log.d(TAG, "onActivityCreated");
    super.onActivityCreated(savedInstanceState);
    setTitle(getResources().getString(R.string.app_dml_name));
  }
}
