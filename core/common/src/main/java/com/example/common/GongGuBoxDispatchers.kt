package com.example.common

import javax.inject.Qualifier

@Qualifier
@Retention(AnnotationRetention.RUNTIME)
annotation class Dispatcher(val ggbDispatchers: GongGuBoxDispatchers)

enum class GongGuBoxDispatchers { IO, DEFAULT }