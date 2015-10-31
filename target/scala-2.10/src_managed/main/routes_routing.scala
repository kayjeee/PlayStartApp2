// @SOURCE:C:/Users/kayjee lahong/PlayStartApp2/conf/routes
// @HASH:8b3e0a7e976dddbd4236e17e93733014ffc4cb56
// @DATE:Tue Oct 06 10:58:23 CAT 2015


import play.core._
import play.core.Router._
import play.core.j._

import play.api.mvc._
import play.libs.F

import Router.queryString

object Routes extends Router.Routes {

private var _prefix = "/"

def setPrefix(prefix: String) {
  _prefix = prefix  
  List[(String,Routes)]().foreach {
    case (p, router) => router.setPrefix(prefix + (if(prefix.endsWith("/")) "" else "/") + p)
  }
}

def prefix = _prefix

lazy val defaultPrefix = { if(Routes.prefix.endsWith("/")) "" else "/" } 


// @LINE:6
private[this] lazy val controllers_Application_index0 = Route("GET", PathPattern(List(StaticPart(Routes.prefix))))
        

// @LINE:7
private[this] lazy val controllers_Dashboard_index1 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("dashboard"))))
        

// @LINE:9
private[this] lazy val controllers_Application_authenticate2 = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("login"))))
        

// @LINE:10
private[this] lazy val controllers_Application_logout3 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("logout"))))
        

// @LINE:12
private[this] lazy val controllers_account_settings_Index_index4 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("settings"))))
        

// @LINE:13
private[this] lazy val controllers_account_settings_Password_index5 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("settings/password"))))
        

// @LINE:14
private[this] lazy val controllers_account_settings_Password_runPassword6 = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("settings/password"))))
        

// @LINE:15
private[this] lazy val controllers_account_settings_Email_index7 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("settings/email"))))
        

// @LINE:16
private[this] lazy val controllers_account_settings_Email_runEmail8 = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("settings/email"))))
        

// @LINE:19
private[this] lazy val controllers_account_Signup_create9 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("signup"))))
        

// @LINE:20
private[this] lazy val controllers_account_Signup_save10 = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("signup"))))
        

// @LINE:23
private[this] lazy val controllers_account_Signup_confirm11 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("confirm/"),DynamicPart("confirmToken", """[^/]+"""))))
        

// @LINE:26
private[this] lazy val controllers_account_Reset_ask12 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("reset/ask"))))
        

// @LINE:27
private[this] lazy val controllers_account_Reset_runAsk13 = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("reset/ask"))))
        

// @LINE:30
private[this] lazy val controllers_account_Reset_reset14 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("reset/"),DynamicPart("token", """[^/]+"""))))
        

// @LINE:31
private[this] lazy val controllers_account_Reset_runReset15 = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("reset/"),DynamicPart("token", """[^/]+"""))))
        

// @LINE:33
private[this] lazy val controllers_account_settings_Email_validateEmail16 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("email/"),DynamicPart("token", """[^/]+"""))))
        

// @LINE:36
private[this] lazy val controllers_Assets_at17 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("assets/"),DynamicPart("file", """.+"""))))
        
def documentation = List(("""GET""", prefix,"""controllers.Application.index()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """dashboard""","""controllers.Dashboard.index()"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """login""","""controllers.Application.authenticate()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """logout""","""controllers.Application.logout()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """settings""","""controllers.account.settings.Index.index()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """settings/password""","""controllers.account.settings.Password.index()"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """settings/password""","""controllers.account.settings.Password.runPassword()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """settings/email""","""controllers.account.settings.Email.index()"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """settings/email""","""controllers.account.settings.Email.runEmail()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """signup""","""controllers.account.Signup.create()"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """signup""","""controllers.account.Signup.save()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """confirm/$confirmToken<[^/]+>""","""controllers.account.Signup.confirm(confirmToken:String)"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """reset/ask""","""controllers.account.Reset.ask()"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """reset/ask""","""controllers.account.Reset.runAsk()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """reset/$token<[^/]+>""","""controllers.account.Reset.reset(token:String)"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """reset/$token<[^/]+>""","""controllers.account.Reset.runReset(token:String)"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """email/$token<[^/]+>""","""controllers.account.settings.Email.validateEmail(token:String)"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """assets/$file<.+>""","""controllers.Assets.at(path:String = "/public", file:String)""")).foldLeft(List.empty[(String,String,String)]) { (s,e) => e match {
  case r @ (_,_,_) => s :+ r.asInstanceOf[(String,String,String)]
  case l => s ++ l.asInstanceOf[List[(String,String,String)]] 
}}
       
    
def routes:PartialFunction[RequestHeader,Handler] = {        

// @LINE:6
case controllers_Application_index0(params) => {
   call { 
        invokeHandler(controllers.Application.index(), HandlerDef(this, "controllers.Application", "index", Nil,"GET", """ Home page""", Routes.prefix + """"""))
   }
}
        

// @LINE:7
case controllers_Dashboard_index1(params) => {
   call { 
        invokeHandler(controllers.Dashboard.index(), HandlerDef(this, "controllers.Dashboard", "index", Nil,"GET", """""", Routes.prefix + """dashboard"""))
   }
}
        

// @LINE:9
case controllers_Application_authenticate2(params) => {
   call { 
        invokeHandler(controllers.Application.authenticate(), HandlerDef(this, "controllers.Application", "authenticate", Nil,"POST", """""", Routes.prefix + """login"""))
   }
}
        

// @LINE:10
case controllers_Application_logout3(params) => {
   call { 
        invokeHandler(controllers.Application.logout(), HandlerDef(this, "controllers.Application", "logout", Nil,"GET", """""", Routes.prefix + """logout"""))
   }
}
        

// @LINE:12
case controllers_account_settings_Index_index4(params) => {
   call { 
        invokeHandler(controllers.account.settings.Index.index(), HandlerDef(this, "controllers.account.settings.Index", "index", Nil,"GET", """""", Routes.prefix + """settings"""))
   }
}
        

// @LINE:13
case controllers_account_settings_Password_index5(params) => {
   call { 
        invokeHandler(controllers.account.settings.Password.index(), HandlerDef(this, "controllers.account.settings.Password", "index", Nil,"GET", """""", Routes.prefix + """settings/password"""))
   }
}
        

// @LINE:14
case controllers_account_settings_Password_runPassword6(params) => {
   call { 
        invokeHandler(controllers.account.settings.Password.runPassword(), HandlerDef(this, "controllers.account.settings.Password", "runPassword", Nil,"POST", """""", Routes.prefix + """settings/password"""))
   }
}
        

// @LINE:15
case controllers_account_settings_Email_index7(params) => {
   call { 
        invokeHandler(controllers.account.settings.Email.index(), HandlerDef(this, "controllers.account.settings.Email", "index", Nil,"GET", """""", Routes.prefix + """settings/email"""))
   }
}
        

// @LINE:16
case controllers_account_settings_Email_runEmail8(params) => {
   call { 
        invokeHandler(controllers.account.settings.Email.runEmail(), HandlerDef(this, "controllers.account.settings.Email", "runEmail", Nil,"POST", """""", Routes.prefix + """settings/email"""))
   }
}
        

// @LINE:19
case controllers_account_Signup_create9(params) => {
   call { 
        invokeHandler(controllers.account.Signup.create(), HandlerDef(this, "controllers.account.Signup", "create", Nil,"GET", """ Registers the user, sending an email to confirm the account.""", Routes.prefix + """signup"""))
   }
}
        

// @LINE:20
case controllers_account_Signup_save10(params) => {
   call { 
        invokeHandler(controllers.account.Signup.save(), HandlerDef(this, "controllers.account.Signup", "save", Nil,"POST", """""", Routes.prefix + """signup"""))
   }
}
        

// @LINE:23
case controllers_account_Signup_confirm11(params) => {
   call(params.fromPath[String]("confirmToken", None)) { (confirmToken) =>
        invokeHandler(controllers.account.Signup.confirm(confirmToken), HandlerDef(this, "controllers.account.Signup", "confirm", Seq(classOf[String]),"GET", """ Accessed when the user confirms the registration.""", Routes.prefix + """confirm/$confirmToken<[^/]+>"""))
   }
}
        

// @LINE:26
case controllers_account_Reset_ask12(params) => {
   call { 
        invokeHandler(controllers.account.Reset.ask(), HandlerDef(this, "controllers.account.Reset", "ask", Nil,"GET", """ Displays a page to send a reset email given the user's email.""", Routes.prefix + """reset/ask"""))
   }
}
        

// @LINE:27
case controllers_account_Reset_runAsk13(params) => {
   call { 
        invokeHandler(controllers.account.Reset.runAsk(), HandlerDef(this, "controllers.account.Reset", "runAsk", Nil,"POST", """""", Routes.prefix + """reset/ask"""))
   }
}
        

// @LINE:30
case controllers_account_Reset_reset14(params) => {
   call(params.fromPath[String]("token", None)) { (token) =>
        invokeHandler(controllers.account.Reset.reset(token), HandlerDef(this, "controllers.account.Reset", "reset", Seq(classOf[String]),"GET", """ Resets the password using the password.""", Routes.prefix + """reset/$token<[^/]+>"""))
   }
}
        

// @LINE:31
case controllers_account_Reset_runReset15(params) => {
   call(params.fromPath[String]("token", None)) { (token) =>
        invokeHandler(controllers.account.Reset.runReset(token), HandlerDef(this, "controllers.account.Reset", "runReset", Seq(classOf[String]),"POST", """""", Routes.prefix + """reset/$token<[^/]+>"""))
   }
}
        

// @LINE:33
case controllers_account_settings_Email_validateEmail16(params) => {
   call(params.fromPath[String]("token", None)) { (token) =>
        invokeHandler(controllers.account.settings.Email.validateEmail(token), HandlerDef(this, "controllers.account.settings.Email", "validateEmail", Seq(classOf[String]),"GET", """""", Routes.prefix + """email/$token<[^/]+>"""))
   }
}
        

// @LINE:36
case controllers_Assets_at17(params) => {
   call(Param[String]("path", Right("/public")), params.fromPath[String]("file", None)) { (path, file) =>
        invokeHandler(controllers.Assets.at(path, file), HandlerDef(this, "controllers.Assets", "at", Seq(classOf[String], classOf[String]),"GET", """ Map static resources from the /public folder to the /assets URL path""", Routes.prefix + """assets/$file<.+>"""))
   }
}
        
}
    
}
        