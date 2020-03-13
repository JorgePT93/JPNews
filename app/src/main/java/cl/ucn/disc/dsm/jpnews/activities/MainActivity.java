/*
 * Copyright 2020-2021 Jorge Pizarro Tapia <jpt010@alumnos.ucn.cl>.
 *
 *  Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 *
 * https://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *
 *   See the License for the specific language governing permissions and limitations under the License.
 */

package cl.ucn.disc.dsm.thenews.activities;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import cl.ucn.disc.dsm.thenews.R;
import cl.ucn.disc.dsm.thenews.databinding.ActivityMainBinding;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * The Main Launcher Activity.
 *
 * @author Diego Urrutia-Astorga.
 */
public class MainActivity extends AppCompatActivity {

  /**
   * The Logger
   */
  private static final Logger log = LoggerFactory.getLogger(MainActivity.class);

  /**
   * @param savedInstanceState to use.
   */
  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);

    // Inflate the layout
    ActivityMainBinding binding = ActivityMainBinding.inflate(getLayoutInflater());

    // Assign to the main view.
    setContentView(binding.getRoot());

    // Set the toolbar
    {
      this.setSupportActionBar(binding.toolbar);
    }

    // The refresh
    {
      binding.swlRefresh.setOnRefreshListener(() -> {
        log.debug("Refreshing ..");
      });
    }

  }

}