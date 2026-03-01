(define compD
    (lambda (d a b)
        (if (= a b)
            #t
            (if (= d -1)
                (> a b)
                (< a b)
            )
        )
    )
)

(define isSortedHelper
    (lambda (lst d)
        (if (null? lst)
            #t
            (if (null? (cdr lst))
                #t
                (if (compD d (car lst) (car (cdr lst)))
                    (isSortedHelper (cdr lst) d)
                    #f
                )
            )
        )
    )
)

(define isSorted
    (lambda (lst)
        (if (isSortedHelper lst -1)
            #t
            (isSortedHelper lst 1)
        )
    )
)