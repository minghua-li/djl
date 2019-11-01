/*
 * Copyright 2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License"). You may not use this file except in compliance
 * with the License. A copy of the License is located at
 *
 * http://aws.amazon.com/apache2.0/
 *
 * or in the "license" file accompanying this file. This file is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES
 * OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions
 * and limitations under the License.
 */
package ai.djl.repository.zoo;

import ai.djl.Device;
import ai.djl.MalformedModelException;
import java.io.IOException;
import java.util.Map;

public interface ModelLoader<I, O> {

    ZooModel<I, O> loadModel(Map<String, String> criteria)
            throws IOException, ModelNotFoundException, MalformedModelException;

    ZooModel<I, O> loadModel(Map<String, String> criteria, Device device)
            throws IOException, ModelNotFoundException, MalformedModelException;
}