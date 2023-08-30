function sortArray(){
    const sorted = [...array];
    for (let i = 0; i < sorted.length - 1; i++){
        for (let j = 0; j < sorted.length - 1 - i; j++){
            console.log(sorted[j]);
        }
    }
    return sorted;
}

array = [5, 3, 2, 7, 9, 1, 4];

sortArray(array);