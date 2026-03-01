(define validateProcInput
    (lambda (lstA lstB)
        (if (null? lstA)
            #f
            (if (null? lstB)
                #f
                (if (null? (cdr lstA))
                    (null? (cdr lstB))
                    (validateProcInput (cdr lstA) (cdr lstB))
                )
            )
        )
    )
)

(define procList
    (lambda (op lst1 lst2)
        (if (validateProcInput lst1 lst2)
            (cons (op (car lst1) (car lst2)) (procList op (cdr lst1) (cdr lst2)))
            (list)
        )
    )
)

(define add
    (lambda (pair1 pair2)
        (cons (+ (car pair1) (car pair2)) (+ (cdr pair1) (cdr pair2)))
    )
)