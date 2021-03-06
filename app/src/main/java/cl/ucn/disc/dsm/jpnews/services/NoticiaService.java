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

package cl.ucn.disc.dsm.jpnews.services;

import cl.ucn.disc.dsm.jpnews.model.Noticia;
import java.util.List;

/**
 * The Service Class.
 *
 * @author Diego Urrutia-Astorga.
 */
public interface NoticiaService {

  /**
   * Get the Noticias from the backend.
   *
   * @param pageSize how many.
   * @return the {@link List} of {@link Noticia}.
   */
  List<Noticia> getNoticias(final int pageSize);

}