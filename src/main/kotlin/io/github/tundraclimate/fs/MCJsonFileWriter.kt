package io.github.tundraclimate.fs

import io.github.tundraclimate.fs.filetype.MCJson
import java.io.File

class MCJsonFileWriter(private val file: File): MCFileWriter<MCJson> {
    override fun write(content: MCJson) {
        if (file.extension == "json" && file.exists()) {
            file.writeBytes(content.body.toByteArray())
        }
    }
}