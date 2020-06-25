val lambda: (Long, Long) -> Long = { left: Long, right: Long ->
             var result = 1L
                for (i in left..right) {
                    result *= i
                }
                     result.toLong()
    }
