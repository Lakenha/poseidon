package framework.util

import groovy.MqlMapper;

/*
 * Copyright (C) 2020 tiansheng All rights reserved.
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

/*
 * Creates on 2020/6/23.
 */

import javassist.NotFoundException
import org.jiakesimk.minipika.framework.util.ArrayUtils
import org.jiakesimk.minipika.framework.util.Methods
import org.junit.Test

/**
 * @author tiansheng
 */
class MethodsTest {

  @Test
  void test() throws NotFoundException {
    ArrayUtils.toString(Methods.getParameterNames(MqlMapper.methods[0]));
  }

  @Test
  void test2() {

  }

}