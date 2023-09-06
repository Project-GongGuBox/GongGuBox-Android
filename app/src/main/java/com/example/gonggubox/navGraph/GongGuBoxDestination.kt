package com.example.gonggubox.navGraph

interface GongGuBoxDestination { val route: String }

object LogoPage: GongGuBoxDestination { override val route: String = "LogoPage" }
object FirstInitPage: GongGuBoxDestination { override val route: String = "FirstInitPage" }
object SecondInitPage: GongGuBoxDestination { override val route: String = "SecondInitPage"}
object SignInPage: GongGuBoxDestination { override val route: String = "SignInPage" }
object InputDeptPage: GongGuBoxDestination { override val route: String = "InputDeptPage" }
object SendOTPCodePage: GongGuBoxDestination { override val route: String = "SendOTPCodePage" }
object InputOTPCodePage: GongGuBoxDestination { override val route: String = "InputOTPCodePage" }
