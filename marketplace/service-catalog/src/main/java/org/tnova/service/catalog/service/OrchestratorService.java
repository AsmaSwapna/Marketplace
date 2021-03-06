/*
 * Copyright 2016  CloudStreet Oy
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

package org.tnova.service.catalog.service;

import org.tnova.service.catalog.conversion.NetworkServiceDTO;
import org.tnova.service.catalog.domain.nsd.NetworkService;

public interface OrchestratorService
{
    boolean createNsdToOrchestrator( NetworkService networkService );

    boolean modifyNsdToOrchestrator( NetworkService networkService );

    boolean deleteNsdToOrchestrator( NetworkService networkService );
}
