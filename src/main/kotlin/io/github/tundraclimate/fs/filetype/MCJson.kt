package io.github.tundraclimate.fs.filetype

import io.github.tundraclimate.fs.MCFile

class MCJson(val body: String): MCFile {
    companion object {
        fun createLoadersJson(values: List<String>): MCJson {
            val vls = values.toMutableList().also { it[0] = "\"${it[0]}\"" }.reduce { it, next -> "$it, \"$next\"" }
            return MCJson(
                """
                    {
                        "values": [${vls}]
                    }
                """.trimIndent()
            )
        }

        fun createLoadersJson(value: String): MCJson = createLoadersJson(listOf(value))
    }
}