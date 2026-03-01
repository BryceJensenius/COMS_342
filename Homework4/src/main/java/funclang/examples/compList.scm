(define compList
    (lambda (lst)
        (if (null? lst)
            lst
            (if (null? (cdr lst))
                lst
                (if (= (car lst) (car (cdr lst)))
                    (compList (cdr lst))
                    (cons (car lst) (compList (cdr lst)))
                )
            )
        )
    )
)