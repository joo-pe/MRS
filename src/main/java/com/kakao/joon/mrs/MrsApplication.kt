package com.kakao.joon.mrs

import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication

@SpringBootApplication
object MrsApplication {

    @JvmStatic
    fun main(args: Array<String>) {
        SpringApplication.run(MrsApplication::class.java, *args)
    }

}

