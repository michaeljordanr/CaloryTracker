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
    }
}

rootProject.name = "CaloryTracker"
include(":app")
include(":core")
include(":onboarding")
include(":onboarding:onboarding-presentation")
include(":onboarding:onboarding-domain")
include(":tracker")
include(":tracker:tracker-data")
include(":tracker:tracker-domain")
include(":tracker:tracker-presentation")
