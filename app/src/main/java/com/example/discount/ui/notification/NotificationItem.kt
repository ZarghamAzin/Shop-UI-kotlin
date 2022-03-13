package com.example.discount.ui.notification

data class NotificationItem(val title: String, val body: String)

val notificationItems = listOf(
    NotificationItem(
        title = "Notify me for Discounts\n" +
                "in nearby shop",
        body = "Lorem ipsum dolor sit amet, consectetur " +
                "adipiscing elit. Proin viverra"
    ),
    NotificationItem(
        title = "Notify me for Discounts\n" +
                "in nearby shop",
        body = "Lorem ipsum dolor sit amet, consectetur " +
                "adipiscing elit. Proin viverra"
    ),
    NotificationItem(
        title = "Notify me for Discounts\n" +
                "in nearby shop",
        body = "Lorem ipsum dolor sit amet, consectetur " +
                "adipiscing elit. Proin viverra"
    )
)
