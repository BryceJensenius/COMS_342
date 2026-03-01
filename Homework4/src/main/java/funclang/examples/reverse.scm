(define append
    (lambda (lst a)
        (if (null? lst)
            (cons a (list))
            (cons (car lst) (append (cdr lst) a))
        )
    )
)

(define reverse
    (lambda (lst)
        (if (null? lst)
            (list)
            (if (null? (cdr lst))
                lst
                (append
                    (reverse (cdr lst))
                    (car lst)
                )
            )
        )
    )
)