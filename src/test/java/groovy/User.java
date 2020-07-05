package groovy;

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
 * Creates on 2020/6/14.
 */

import lombok.Data;

import java.math.BigDecimal;

/**
 * @author tiansheng
 */
@Data
public class User {

  private Integer id;
  private String name;
  private String username;
  private String password;
  private Integer age;
  private BigDecimal money;
  private User user;

  public User(){}

  public User(String name) {
    this.name = name;
  }

}
