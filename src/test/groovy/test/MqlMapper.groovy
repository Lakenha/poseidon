package test

import org.jiakesimk.minipika.components.annotation.Batch
import org.jiakesimk.minipika.components.annotation.Insert
import org.jiakesimk.minipika.components.annotation.Select
import org.jiakesimk.minipika.components.annotation.Update
import org.jiakesimk.minipika.framework.factory.Factorys
import org.junit.Test

interface MqlMapper {

  @Select(value = """
    select * from website_user_info where 1=1
    #IF INE(user.username) && user.username != null
      and username = #{user.username}
    #END
  """, forList = User.class)
  def findUser(user)

  @Insert("""
    insert into website_user_info (username, `password`) 
    values (#{user.username},#{user.password})
  """)
  def addUser(user)

  @Update("""
    UPDATE `website_user_info` SET `username` = #{user.username}, `password` = #{user.password} WHERE `id` = #{id};
  """)
  def updateUser(id, user)

  @Batch("""
    insert into website_user_info (username, `password`) values (?, ?)
    #FOREACH user : users
      #{user.username},#{user.password}
    #END
  """)
  def addBatch(List<User> users)

  public <T> T findUserById(id)

}