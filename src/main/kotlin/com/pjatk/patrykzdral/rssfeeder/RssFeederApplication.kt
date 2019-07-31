package com.pjatk.patrykzdral.rssfeeder

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class RssFeederApplication

fun main(args: Array<String>) {
	runApplication<RssFeederApplication>(*args)
}
