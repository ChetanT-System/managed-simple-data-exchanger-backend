/*
 * Copyright 2022 CatenaX
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
package com.catenax.dft.gateways.external;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
public class EDCAssetChildGateway extends EDCGateway {

    @Value(value = "${edc.child.aspect.url}")
    private String edcEndpoint;
    @Value(value = "${edc.child.aspect.apiKey}")
    private String apiKey;
    @Value(value = "${edc.child.aspect.apiValue}")
    private String apiValue;

    @Override
    protected String getEndPoint() {
        return edcEndpoint;
    }

    @Override
    protected String getApiKey() {
        return apiKey;
    }

    @Override
    protected String getApiValue() {
        return apiValue;
    }
}
