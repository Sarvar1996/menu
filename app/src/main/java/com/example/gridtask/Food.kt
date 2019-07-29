package com.example.gridtask


class Food {
    var name: String? = null
    var image: Int? = null
    var description: String? = null

    constructor(name: String, image: Int, description: String) {
        this.description = description
        this.name = name
        this.image = image
    }
}