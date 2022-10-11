package io.github.tundraclimate.fs.filetype

import io.github.tundraclimate.fs.MCFile

class MCMeta(val body: String): MCFile {
    companion object {
        fun createPackMeta(format: Int, desc: String): MCMeta {
            return MCMeta("""
            {
                "pack": {
                    "pack_format": $format,
                    "description": "$desc"
                }
            }
        """.trimIndent())
        }
    }
}