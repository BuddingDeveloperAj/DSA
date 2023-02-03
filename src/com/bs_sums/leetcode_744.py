start = 0
end = len(letters) - 1

while (start <= end):
    mid = (start + (end - start)//2)
    if (target < letters[mid]):
        end = mid - 1
    else:
        start = mid + 1

return letters[start % len(letters)]