(define pellHelper
    (lambda (a b n)
        (if (= n 0)
            (list)
            (let ((next (+ (* 2 b) a)))
                (cons next (pellHelper b next (- n 1)))
            )
        )
    )
)

(define pell
    (lambda (n)
        (if (= n 0)
            (list)
            (if (= n 1)
                (cons 0 (list))
                (cons 0
                    (cons 1
                        (pellHelper 0 1 (- n 2))
                    )
                )
            )
        )
    )
)