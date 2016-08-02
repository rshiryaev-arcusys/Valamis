package com.arcusys.valamis.web.servlet.social.response

import com.arcusys.valamis.social.model.Comment
import com.arcusys.valamis.user.model.UserInfo
import com.arcusys.valamis.user.service.UserService
import org.ocpsoft.prettytime.PrettyTime

case class CommentResponse(id: Long,
                           user: UserInfo,
                           content: String,
                           creationDate: String,
                           lastUpdateDate: Option[String]
                          )

trait CommentConverter {
  protected def userService: UserService

  private val prettyTime = new PrettyTime

  protected def toResponse(from: Comment): CommentResponse =
    CommentResponse(
      id = from.id.get,
      user = new UserInfo(userService.getById(from.userId)),
      content = from.content,
      creationDate = prettyTime.format(from.creationDate.toDate),
      lastUpdateDate = from.lastUpdateDate.map(date => prettyTime.format(date.toDate))
    )
}