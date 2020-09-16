/*
 * (C) Copyright 2017 Boni Garcia (http://bonigarcia.github.io/)
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *
 */
package io.github.bonigarcia;

import static java.lang.invoke.MethodHandles.lookup;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.slf4j.LoggerFactory.getLogger;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;

class ExceptionTest {

    static final Logger log = getLogger(lookup().lookupClass());

    MySUT mySut;

    @BeforeEach
    void setup() {
        mySut = new MySUT("[Assertions test]");
    }

    @Test
    void exceptionTesting() {
        log.debug("Testing with assertThrows");
        assertThrows(RuntimeException.class, mySut::releaseId);
        log.debug("End of test");
    }

}
