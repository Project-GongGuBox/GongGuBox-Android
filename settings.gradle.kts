@file:Suppress("UnstableApiUsage")

include(":core:common")



pluginManagement {
    repositories {
        google()
        mavenCentral()
        gradlePluginPortal()
    }
}

dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
    repositories {
        google()
        mavenCentral()
        maven(url = "https://devrepo.kakao.com/nexus/content/groups/public/")
    }
}

rootProject.name = "GongGuBox"
include(":app")

include(":core:data")
include(":core:domain")
include(":core:design_system")
include(":core:network")
include(":core:ui")
include(":core:model")
